package com.leetcode;

import java.util.Arrays;

public class CountDaysWithoutMeeting {
    public int countDays(int days, int[][] meetings) {
        if (meetings.length == 0) return days;

        // Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int totalMeetingDays = 0;
        int start = meetings[0][0], end = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            int currStart = meetings[i][0], currEnd = meetings[i][1];

            if (currStart <= end) {
                // Merge overlapping meetings
                end = Math.max(end, currEnd);
            } else {
                // Add merged interval count
                totalMeetingDays += (end - start + 1);
                start = currStart;
                end = currEnd;
            }
        }

        // Add the last merged interval
        totalMeetingDays += (end - start + 1);

        // Free days = total days - occupied days
        return days - totalMeetingDays;
    }
    public static void main(String[] args) {
        int days = 10;
        int[][] meetings = {{5,7},{1,3},{9,10}};
        CountDaysWithoutMeeting countDaysWithoutMeeting = new CountDaysWithoutMeeting();
        int result = countDaysWithoutMeeting.countDays(days,meetings);
        System.out.println(result);
    }
}
