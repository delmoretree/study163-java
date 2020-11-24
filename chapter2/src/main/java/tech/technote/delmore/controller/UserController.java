package tech.technote.delmore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.technote.delmore.entity.TUser;
import tech.technote.delmore.jparepositories.TUserRepository;

@RestController
public class UserController {

    @Autowired
    private TUserRepository tUserRepository;

//    public List<TUser> getAll() {
//
//    }

    @RequestMapping(value = "/tusers/id/{id}", method = RequestMethod.GET)
    public TUser getById(@PathVariable int id) {
        return tUserRepository.findById(id).get();
    }

    @RequestMapping(value = "/tusers/username/{username}", method = RequestMethod.GET)
    public TUser getByUserName(@PathVariable String username) {
        return tUserRepository.findTUserByUsernameLike("%"+username+"%");
    }

    @RequestMapping(value = "/tusers", method = RequestMethod.POST)
    public TUser save(TUser user) {
        return tUserRepository.save(user);
    }
}
