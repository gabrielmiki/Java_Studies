package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_assessment")
public class PhysicalAssessment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "student_id")
  private Student student;

  private LocalDateTime dateOfAssessment = LocalDateTime.now();

  @Column(name = "current_weight")
  private double weight;
  @Column(name = "current_height")
  private double height;

}
