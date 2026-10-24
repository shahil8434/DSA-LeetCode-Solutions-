class Solution {

    public int convertday(String date){
        int[] days = {31, 28, 31, 30, 31, 30,
                  31, 31, 30, 31, 30, 31};
          int month = Integer.parseInt(date.substring(0, 2));
          int day = Integer.parseInt(date.substring(3, 5));

          int totalDay = day;

          for(int i = 0; i < month - 1; i++){
            totalDay+= days[i];
          }
          return totalDay;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startAlice = convertday(arriveAlice);
        int endAlice = convertday(leaveAlice);
        int startBob = convertday(arriveBob);
        int endBob = convertday(leaveBob);

        int start = Math.max(startAlice, startBob);
        int end = Math.min(endAlice, endBob);

        if(start > end){
            return 0;
        }
        return end - start + 1;
    }
}