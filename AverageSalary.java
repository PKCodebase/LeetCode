package com.leetcode;

public class AverageSalary {
        public double average(int[] salary) {
            int max = salary[0];
            int min = salary[0];
            int sum = salary[0];
            for(int i = 1;i<salary.length;i++){
                if(max < salary[i]){
                    max = salary[i];
                }
                if(min > salary[i]){
                    min = salary[i];
                }
                sum = sum + salary[i];
            }
            sum = sum - min - max;
            double result = (double)sum/(salary.length-2);
            return result;
        }
        public static void main(String[] args) {
            int [] salary = {4000,3000,1000,2000};
            AverageSalary averageSalary = new AverageSalary();
            double result = averageSalary.average(salary);
            System.out.println(result);
        }
}
