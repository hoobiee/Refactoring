package com.refactor.bootcamp.data_clumps;
/*
* 数据泥团 数据项就像小孩子，总喜欢成群结对地的待在一块,
* 如果删掉众多数据中的一项，其他数据因而失去意义,就应该为它们产生一个新对象
*
* 1.如果一个类里有很多有关系的数据Field,那么就要考虑为这些有关系的数据建立一个新家
*  ->Extract Class 创建数据新对象
* 2.如果函数参数应用很多有关系的Field,那么就要考虑让这些分散的参变成参数对象
*  ->Introduce Parameter Object 引用参数对象
* 3.如果一个函数引用的来自同一个对象的若干个参数作为参数,可以考虑引用对象
* 因为如果被调用的的函数改变参数，必须修改这个函数的所有引用的地方
*  ->Preserve Whole Object(保持对象完整)
*/