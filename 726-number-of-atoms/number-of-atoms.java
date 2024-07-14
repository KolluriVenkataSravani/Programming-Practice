class Solution {
    public String countOfAtoms(String formula) {
        Deque<Map<String, Integer>> stackk = new LinkedList<>();
        Map<String, Integer> cmap = new HashMap<>();
        int n = formula.length();
        int i = 0;

        while (i < n) {
            char c = formula.charAt(i);

            if (c == '(') {
                stackk.push(cmap);
                cmap = new HashMap<>();
                i++;
            } else if (c == ')') {
                int j = i + 1;
                int num = 0;
                while (j < n && Character.isDigit(formula.charAt(j))) {
                    num = num * 10 + (formula.charAt(j) - '0');
                    j++;
                }
                num = num == 0 ? 1 : num;
                i = j;

                Map<String, Integer> top = stackk.pop();
                for (Map.Entry<String, Integer> entry : cmap.entrySet()) {
                    top.put(entry.getKey(), top.getOrDefault(entry.getKey(), 0) + entry.getValue() * num);
                }
                cmap = top;
            } else {
                int j = i + 1;
                while (j < n && Character.isLowerCase(formula.charAt(j))) {
                    j++;
                }
                String ele = formula.substring(i, j);
                i = j;

                int num = 0;
                while (j < n && Character.isDigit(formula.charAt(j))) {
                    num = num * 10 + (formula.charAt(j) - '0');
                    j++;
                }
                num = num == 0 ? 1 : num;
                cmap.put(ele, cmap.getOrDefault(ele, 0) + num);
                i = j;
            }
        }

        StringBuilder ans = new StringBuilder();
        cmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
            ans.append(entry.getKey());
            if (entry.getValue() > 1) {
                ans.append(entry.getValue());
            }
        });

        return ans.toString();
    }
}