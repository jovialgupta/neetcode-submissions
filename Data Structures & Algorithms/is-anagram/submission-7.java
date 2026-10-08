class Solution {
    public boolean isAnagram(String s, String t) {
       char[] a = s.toCharArray();
       Arrays.sort(a);
       char[] b = t.toCharArray();
       Arrays.sort(b);
       int n = a.length;
       int d = b.length;
       if(n != d)
       return false;

for(int i=0;i<n;i++){
    if(a[i] != b[i])
    return false;
} return true;
    }
}
