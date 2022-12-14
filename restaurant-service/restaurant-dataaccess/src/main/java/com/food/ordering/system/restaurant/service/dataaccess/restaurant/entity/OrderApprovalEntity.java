package com.food.ordering.system.restaurant.service.dataaccess.restaurant.entity;

import com.food.ordering.system.domain.valueobject.OrderApprovalStatus;
import java.util.UUID;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_approval", schema = "restaurant")
@Entity
public class OrderApprovalEntity {

  @Id private UUID id;
  private UUID restaurantId;
  private UUID orderId;

  @Enumerated(EnumType.STRING)
  private OrderApprovalStatus status;
}
