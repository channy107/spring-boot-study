package kr.co.luis.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.List;

public interface MenuItemRepository {
    List<MenuItem> findAllByRestaurantId(Long restaurantId);
}
