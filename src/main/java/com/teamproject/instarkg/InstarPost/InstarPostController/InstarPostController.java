package com.teamproject.instarkg.InstarPost.InstarPostController;

import com.teamproject.instarkg.InstarPost.InstarPost.InstarPost;
import com.teamproject.instarkg.InstarPost.InstarPostRepository.InstarPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/po")
public class InstarPostController {
    @Autowired
    private InstarPostRepository instarPostRepository;

    @RequestMapping("/list")
    @ResponseBody
    public List<InstarPost> showList(){
        return instarPostRepository.findAll();
    }


}
