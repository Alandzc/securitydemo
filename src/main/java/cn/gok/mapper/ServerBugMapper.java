package cn.gok.mapper;

import cn.gok.dto.JoinCustom;
import cn.gok.entity.ServerBug;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Mapper
public interface ServerBugMapper extends BaseMapper<ServerBug> {


}
