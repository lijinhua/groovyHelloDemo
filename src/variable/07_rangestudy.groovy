package variable
/**
 * range的学习
 */
def range = 1..10
println range[0]

println range.contains(10)

println range.from
println range.to

//遍历
range.each {
    println it
}

for (i in range){
    println i
}

def getGrade(Number number){
    def result
    switch (number){
        case 0..60:
            result= '不及格'
            break
        case 60..<70:
            result = '及格'
            break
    }
}

def result = getGrade(67)

println result