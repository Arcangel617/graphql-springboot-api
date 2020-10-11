package com.example.graphql.springboot.api.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.springboot.api.entity.Vehicle;
import com.example.graphql.springboot.api.service.VehicleService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

  @Autowired
  private VehicleService vehicleService;

  public List<Vehicle> getVehicles(final int count) {
    return this.vehicleService.getAllVehicles(count);
  }

  public Optional<Vehicle> getVehicle(final int id) {
    return this.vehicleService.getVehicle(id);
  }
}
