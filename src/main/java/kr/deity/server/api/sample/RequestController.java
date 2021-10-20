package kr.deity.server.api.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/request")
public class RequestController {
    Logger logger = LoggerFactory.getLogger(RequestController.class.getName());

    @RequestMapping
    public void request(HttpServletRequest request, HttpServletResponse response){
        String paramId = request.getParameter("id");
        request.getParameterMap();
        request.getParameterNames();
        request.getParameterValues("");

        logger.info(paramId);
    }


    @PostMapping("/file")
    public void rquestFile(MultipartHttpServletRequest request){
        MultipartFile file = request.getFile("tempfile");
        request.getFileMap();
        request.getFileNames();

        logger.info(file.getOriginalFilename());
    }
}
