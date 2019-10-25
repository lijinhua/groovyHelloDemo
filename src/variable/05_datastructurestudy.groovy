package variable

/**
 * Groovy中的列表，映射，范围
 * 列表的排序
 */
//def list = new ArrayList() // java定义的方式
def list = [1,2,3,4,5,6]// groovy的定义方式

println list.class

def array = [1,2,3,4,5] as int[]
int[] array2 = [1,2,3,4,5]

// 上面是定义数组的两处方式
/**
 * list的添加元素
 **/
list.add(7)
list.leftShift(10)
println list
list<<80
println list

def plusList = list+9
println plusList.toListString()

/**
 * list的删除操作
 **/
//list.remove(7)
//list.remove((Object)7)
//list.removeAt(7)
//list.removeElement(7)
//list.removeAll {return it%2==0}
//println list-[7,8]

/**
 * 列表排序
 **/
def sortList = [6,-3,9,2,-7,1,5]

//Comparator mc = {a,b->a==b?0:a>b?1:-1}
//Collections.sort(sortList,mc)

sortList.sort({
    a,b->a==b?0:a>b?1:-1
})
println sortList


def sortStringList = ['hello','f','fd','ttt']
sortStringList.sort({it.size()})
println sortStringList

/**
 * 列表的排序
 * 直接查看ppt
 * **/



