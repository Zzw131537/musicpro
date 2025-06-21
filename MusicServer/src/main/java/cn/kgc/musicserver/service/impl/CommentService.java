package cn.kgc.musicserver.service.impl;


import cn.kgc.musicserver.domain.entity.Admin;
import cn.kgc.musicserver.domain.entity.Comment;
import cn.kgc.musicserver.mapper.AdminMapper;
import cn.kgc.musicserver.mapper.CommentMapper;
import cn.kgc.musicserver.service.IAdminService;
import cn.kgc.musicserver.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends ServiceImpl<CommentMapper, Comment> implements ICommentService{

}
