package com.example.demo.payroll;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

/**
 * @Classname OrderModelAssembler
 * @Description 将order实体组装成HAL
 * @Author liaojp
 * @Date 2020/11/5 14:54
 */
@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {
    @Override
    public EntityModel<Order> toModel(Order entity) {
        EntityModel<Order> order = EntityModel.of(entity, linkTo(methodOn(OrderController.class).one(entity.getId())).withSelfRel(),
                linkTo(methodOn(OrderController.class).all()).withRel("orders"));

        if (entity.getStatus().equals(Status.IN_PROGRESS)) {
            order.add(linkTo(methodOn(OrderController.class).cancel(entity.getId())).withRel("cancel"),
                    linkTo(methodOn(OrderController.class).complete(entity.getId())).withRel("complete"));
        }
        return order;
    }
}
