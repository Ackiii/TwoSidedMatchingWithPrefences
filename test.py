import random
# Create a data set for our Idea

# create a txt after the scheme studentid ; prefernece 1 [x1,x2] ; preference 2 [y1,y2] ; prefernece 3 [z1,z2] ; preference 4  [a1,a2] ; preference 5 [b1,b2]
# seminar id to choose from
seminarid = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
with open('testdata.txt', 'w') as f:
    for x in range(1, 101):
        random.shuffle(seminarid)
        p1 = [seminarid[0], seminarid[1]]
        p2 = [seminarid[2], seminarid[3]]
        p3 = [seminarid[4], seminarid[5]]
        p4 = [seminarid[6], seminarid[7]]
        p5 = [seminarid[8], seminarid[9]]
        f.write("% s" % x + ";" + p1[0] + "," + p1[1] + ";" + p2[0] + "," + p2[1] + ";" +
                p3[0] + "," + p3[1] + ";" + p4[0] + "," + p4[1] + ";" + p5[0] + "," + p5[1])
        if(x != 100):
            f.write("\n")
        if(x == 100):
            f.close()

#buckets = ["1", "2", "3", "4", "5"]
# initial setup
#numbers = list(range(1, 100 + 1))
# dict to hold assignment and randomly shuffled numbers
#employee_numbers = {}
# random.shuffle(numbers)
# assign shuffled numbers to employees
# for idx, employee in enumerate(buckets):
#    employee_numbers[employee] = numbers[idx::len(buckets)]
# print result
# print(employee_numbers)

# Create the same scheme for seminars, just that the preferences are the student id's
numbers = list(range(1, 100 + 1))
with open('seminarpreference.txt', 'w') as f:
    for seminar in range(1, 11):
        random.shuffle(numbers)
        p1 = numbers[:20]
        p2 = numbers[20:40]
        p3 = numbers[40:60]
        p4 = numbers[60:80]
        p5 = numbers[80:100]
        f.write("% s" % seminar + ";")
        for a in p1:
            if(a == p1[-1]):
                f.write("% s" % a + ";")
            else:
                f.write("% s" % a + ",")

        for a in p2:
            if(a == p2[-1]):
                f.write("% s" % a + ";")
            else:
                f.write("% s" % a + ",")

        for a in p3:
            if(a == p3[-1]):
                f.write("% s" % a + ";")
            else:
                f.write("% s" % a + ",")

        for a in p4:
            if(a == p4[-1]):
                f.write("% s" % a + ";")
            else:
                f.write("% s" % a + ",")

        for a in p5:
            if(a == p5[-1]):
                f.write("% s" % a)
            else:
                f.write("% s" % a + ",")
        f.write("\n")
