package de.mycourse.springboot.course.Controller;



import de.mycourse.springboot.course.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService ;


    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodos(/*@RequestParam String name,*/ ModelMap model) {
        model.put("todos:", todoService.retrieveTodos("moha"));
        return "list-todos";
    }

}
