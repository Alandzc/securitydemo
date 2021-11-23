package cn.gok.service.impl;

import cn.gok.common.Result;
import cn.gok.entity.Log;
import cn.gok.entity.User;
import cn.gok.mapper.LogMapper;
import cn.gok.mapper.UserMapper;
import cn.gok.service.LogService;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService,Serializable {

}
