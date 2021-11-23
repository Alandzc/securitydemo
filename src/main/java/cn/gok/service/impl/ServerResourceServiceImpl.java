package cn.gok.service.impl;


import cn.gok.common.Result;
import cn.gok.dto.JoinCustom;
import cn.gok.entity.ServerResource;
import cn.gok.mapper.ServerResourceMapper;
import cn.gok.service.ServerResourceService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ServerResourceServiceImpl extends ServiceImpl<ServerResourceMapper, ServerResource> implements ServerResourceService,Serializable {


}
