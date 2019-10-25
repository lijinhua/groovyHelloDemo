package variable

/**
 * 第二章 gradle自动化构建系列文章 之 Groovy中的Map
 * https://blog.csdn.net/bencheng06/article/details/83629206
 */
def map = new HashMap();

def colors = [red:'ff0000',
               blud:'0000ff',
                green:'00ff00']
// 索引的方式
println colors['red']
println colors.red

// 添加元素
colors.yellow = 'ffff00'
colors.complex = [a:1,b:2]

println colors.toMapString()