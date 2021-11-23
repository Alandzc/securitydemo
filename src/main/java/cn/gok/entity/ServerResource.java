package cn.gok.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


@Data
@TableName("server_resource")
public class ServerResource extends Model<ServerResource> {
    /**
      * 主键
      */
    private String id;

    /**
      * 服务器名称
      */
    private String name;

    /**
      * 服务器Ip
      */
    private String ip;

    /**
      * 状态
      */
    private String stateRadio;

    /**
      * 备注
      */
    private String mark;

    /**
      * 创建时间
      */
    private String createTime;

    /**
      * 归属人
      */
    private String user;

}
