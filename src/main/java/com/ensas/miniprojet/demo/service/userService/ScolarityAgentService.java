package com.ensas.miniprojet.demo.service.userService;

import com.ensas.miniprojet.demo.entity.Identification;
import com.ensas.miniprojet.demo.entity.user.scolartyAgent.ScolarityAgent;
import com.ensas.miniprojet.demo.service.AbstractService;

public interface ScolarityAgentService extends AbstractService<ScolarityAgent> {
    public ScolarityAgent login(Identification identification);
}
