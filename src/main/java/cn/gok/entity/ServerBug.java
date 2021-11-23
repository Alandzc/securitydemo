package cn.gok.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


@Data
@TableName("server_bug")
public class ServerBug extends Model<ServerBug> {
    /**
      * 主键
      */
    private String id;

    /**
      * IP地址
      */
    private String ip;

    /**
      * 端口号
      */
    private String port;

    /**
      * 描述
      */
    private String content;

    /**
      * 类型
      */
    private String typeRadio;

    /**
      * 创建时间
      */
    private String createTime;

    /**
      * 状态
      */
    private String stateRadio;

    /**
      * 处理人
      */
    private String user;

    /**
      * 处理内容
      */
    private String solveCont;

    /**
      * 处理人id
      */
    private Integer userId;

}
