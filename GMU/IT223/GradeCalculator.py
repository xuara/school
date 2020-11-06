#getGrades Function
def getGrades(grade_type):
      g = float(input("Enter grade for: "+grade_type+": "))
      while(g<0 or g>100):
            g = float(input("Error! Enter grade for: "+grade_type+": "))

      return g

#calcPerc() Function
def calcPerc(exm1, exm2, exm3, qAvg, hwAvg):
      perc = exm1*(0.2) + exm2*(0.2) + exm3*(0.3) + qAvg*(0.2) + hwAvg*(0.1)
      return perc

#calcLetter() Function
def calcLetter(perc):
      if(perc>=90):
            ltrGrd = "A"
      elif(perc>=80):
            ltrGrd = "B"
      elif(perc>=70):
            ltrGrd = "C"
      elif(perc>=60):
            ltrGrd = "D"
      else:
            ltrGrd = "F"
      return ltrGrd

#printGrade() Function
def printGrade(ltrGrd):
      print("Your  grade is: ",ltrGrd)

#Function Calls
exam1 = getGrades("Exam1")
exam2 = getGrades("Exam2")
exam3 = getGrades("Exam3")
hwTtl = 0
qTtl = 0

for hwNum in range(1,5):
      hwGrd = getGrades("HW"+str(hwNum))
      hwTtl += hwGrd

for qNum in range(1,9):
      qGrd = getGrades("Quiz"+str(qNum))
      qTtl += qGrd

hwAverage = hwTtl/4
qAverage = qTtl/8
percentage = calcPerc(exam1, exam2, exam3, qAverage, hwAverage)
#letterGrade = calcLetter(percentage)
printGrade(percentage)
