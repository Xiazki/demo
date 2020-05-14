package com.xiazki.dao

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.omg.CORBA.Object

@Mapper
interface TestDao {


    @Select("""
            SELECT
                * 
            FROM
                t_assistant_exercise_task 
            WHERE
                id = #{id}
    """)
    fun findComplex(@Param("id") id: Long): Object

    @Select("""
        <script>
            SELECT
                * 
            FROM
                t_assistant_exercise_task 
            WHERE
                id in  
                
        
        </script>
        
    """)
    fun findIn(@Param("ids") ids: List<Long>): Object

}