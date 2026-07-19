//LeetCode 1109. Corporate Flight Bookings
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int prefix[]=new int[n+1];
        for(int i=0;i<bookings.length;i++){
            int first=bookings[i][0];
            int last=bookings[i][1];
            prefix[first-1] +=bookings[i][2];
            prefix[last]=prefix[last]-bookings[i][2];
        }
        for(int i=1;i<=n;i++){
            prefix[i]+=prefix[i-1];
        }
        return Arrays.copyOfRange(prefix,0,n);
    }
}