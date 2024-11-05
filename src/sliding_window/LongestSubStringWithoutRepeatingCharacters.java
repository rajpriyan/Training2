package sliding_window;

public class LongestSubStringWithoutRepeatingCharacters {
        public static int lengthOfLongestSubstring(String str)
        {
            int n = str.length();
            int res = 0;
            for(int i = 0; i < n; i++)
            {
                boolean[] visited = new boolean[256];
                for(int j = i; j < n; j++)
                {
                    if (visited[str.charAt(j)])
                        break;
                    else
                    {
                        res = Math.max(res, j - i + 1);
                        visited[str.charAt(j)] = true;
                    }
                }
                visited[str.charAt(i)] = false;
            }
            return res;
        }

        public static void main(String args[]) {
            String s = "Rajpriyan";
            System.out.println(lengthOfLongestSubstring(s));
        }
}
