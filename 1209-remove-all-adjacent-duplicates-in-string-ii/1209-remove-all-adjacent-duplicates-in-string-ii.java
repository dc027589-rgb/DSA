class Solution {
    private static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++;
            } else {
                stack.push(new Pair(c, 1));
            }

            if (stack.peek().count == k) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        
        for (Pair pair : stack) {
            sb.append(String.valueOf(pair.ch).repeat(pair.count));
        }

        
        return sb.reverse().toString();
        
    }
}