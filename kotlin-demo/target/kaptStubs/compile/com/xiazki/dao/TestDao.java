package com.xiazki.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/xiazki/dao/TestDao;", "", "findComplex", "Lorg/omg/CORBA/Object;", "id", "", "findIn", "ids", "", "kotlin-demo"})
@org.apache.ibatis.annotations.Mapper()
public abstract interface TestDao {
    
    @org.jetbrains.annotations.NotNull()
    @org.apache.ibatis.annotations.Select(value = {"\n            SELECT\n                * \n            FROM\n                t_assistant_exercise_task \n            WHERE\n                id = #{id}\n    "})
    public abstract org.omg.CORBA.Object findComplex(@org.apache.ibatis.annotations.Param(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @org.apache.ibatis.annotations.Select(value = {"\n        <script>\n            SELECT\n                * \n            FROM\n                t_assistant_exercise_task \n            WHERE\n                id in  \n                \n        \n        </script>\n        \n    "})
    public abstract org.omg.CORBA.Object findIn(@org.jetbrains.annotations.NotNull()
    @org.apache.ibatis.annotations.Param(value = "ids")
    java.util.List<java.lang.Long> ids);
}