/*
Zadanie nr7 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/

import java.util.ArrayList;
import java.util.List;

class GradeStatistics {
    private List<Integer> grades = new ArrayList<Integer>();

    public GradeStatistics() {

    }

    public void AddGrade(Integer grade) {
        this.grades.add(grade);
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    public double calcAverage() throws Exception {
        if (grades.isEmpty())
            throw new Exception("Grades list is empty");
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade.intValue();
        }
        return (double)sum / grades.size();
    }

    public double calcMedian() throws Exception{
        if(grades.isEmpty())
            throw new Exception("Grades list is empty");
        List<Integer> grades = this.grades;
        grades.sort(null);
        if(grades.size() % 2 != 0)
            return (double)grades.get(grades.size()/2);
        else
            return (
                    (double)grades.get(grades.size()/2)
                            + (double)grades.get(grades.size()/2-1)
            ) / 2;
    }

    public Integer calcMinimum() throws Exception {
        if(grades.isEmpty())
            throw new Exception("Grades list is empty");

        Integer min = grades.get(0);
        for(Integer grade : grades){
            if(grade < min)
                min = grade;
        }
        return min;
    }

    public Integer calcMaximum() throws Exception {
        if(grades.isEmpty())
            throw new Exception("Grades list is empty");

        Integer max = grades.get(0);
        for(Integer grade : grades){
            if(grade > max)
                max = grade;
        }
        return max;
    }

    public double calcStandardDeviation() throws Exception {
        double mean = calcAverage();
        double sum = 0;
        for (Integer grade : grades) {
            sum += Math.pow(grade.intValue(), 2) - Math.pow(mean, 2);
        }
        return Math.sqrt(sum / grades.size());
    }
}