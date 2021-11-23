package cn.gok.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


@Data
@TableName("t_log")
public class Log extends Model<Log> {
    /**
      * 主键
      */
    private String id;

    /**
      * 操作内容
      */
    private String content;

    /**
      * 操作时间
      */
    private String time;

    /**
      * 操作人
      */
    private String user;

    private String ip;

}
