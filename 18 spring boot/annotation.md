Spring Framework provides many annotations across different modules. Since you're working on **Spring Boot REST APIs**, here's a categorized list of the most commonly used Spring annotations.

---

# 1. Core Spring Annotations

| Annotation        | Purpose                                             |
| ----------------- | --------------------------------------------------- |
| `@Component`      | Generic Spring Bean                                 |
| `@Service`        | Service Layer Bean                                  |
| `@Repository`     | DAO/Repository Bean                                 |
| `@Controller`     | Spring MVC Controller                               |
| `@RestController` | REST API Controller (`@Controller + @ResponseBody`) |
| `@Configuration`  | Configuration Class                                 |
| `@Bean`           | Creates a Spring Bean manually                      |
| `@Autowired`      | Dependency Injection                                |
| `@Qualifier`      | Select specific bean                                |
| `@Primary`        | Default bean if multiple exist                      |
| `@Lazy`           | Lazy initialization                                 |
| `@Scope`          | Bean scope                                          |

Example:

```java
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

}
```

---

# 2. Spring Boot Annotations

| Annotation                 | Purpose                |
| -------------------------- | ---------------------- |
| `@SpringBootApplication`   | Main Spring Boot class |
| `@EnableAutoConfiguration` | Auto configuration     |
| `@ComponentScan`           | Scan components        |
| `@ConfigurationProperties` | Read properties        |
| `@Value`                   | Inject value           |

Example

```java
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
```

---

# 3. REST Controller Annotations

| Annotation        | Purpose        |
| ----------------- | -------------- |
| `@RequestMapping` | Common mapping |
| `@GetMapping`     | GET API        |
| `@PostMapping`    | POST API       |
| `@PutMapping`     | PUT API        |
| `@DeleteMapping`  | DELETE API     |
| `@PatchMapping`   | PATCH API      |
| `@CrossOrigin`    | Enable CORS    |

Example

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAll(){

    }

}
```

---

# 4. Request Parameter Annotations

| Annotation          | Purpose           |
| ------------------- | ----------------- |
| `@RequestBody`      | Read JSON body    |
| `@RequestParam`     | URL parameter     |
| `@PathVariable`     | Path variable     |
| `@RequestHeader`    | HTTP Header       |
| `@CookieValue`      | Cookie value      |
| `@RequestAttribute` | Request attribute |
| `@ModelAttribute`   | Bind Form Data    |

Example

```java
@GetMapping("/{id}")
public User getUser(@PathVariable int id){

}
```

---

# 5. Response Annotations

| Annotation        | Purpose         |
| ----------------- | --------------- |
| `@ResponseBody`   | Return JSON     |
| `@ResponseStatus` | Set HTTP Status |

Example

```java
@ResponseStatus(HttpStatus.CREATED)
@PostMapping
public User save(){

}
```

---

# 6. Validation Annotations (Jakarta Validation)

| Annotation   | Purpose                |
| ------------ | ---------------------- |
| `@Valid`     | Validate object        |
| `@Validated` | Class level validation |
| `@NotNull`   | Cannot be null         |
| `@NotBlank`  | Cannot be blank        |
| `@NotEmpty`  | Cannot be empty        |
| `@Size`      | Size validation        |
| `@Min`       | Minimum value          |
| `@Max`       | Maximum value          |
| `@Email`     | Email validation       |
| `@Pattern`   | Regex validation       |
| `@Past`      | Past date              |
| `@Future`    | Future date            |
| `@Positive`  | Positive number        |
| `@Negative`  | Negative number        |

Example

```java
public class User {

    @NotBlank
    private String name;

    @Email
    private String email;

}
```

---

# 7. Transaction Annotation

| Annotation       | Purpose              |
| ---------------- | -------------------- |
| `@Transactional` | Database Transaction |

Example

```java
@Transactional
public void saveOrder(){

}
```

---

# 8. Exception Handling

| Annotation              | Purpose               |
| ----------------------- | --------------------- |
| `@ExceptionHandler`     | Handle Exception      |
| `@ControllerAdvice`     | Global Exception      |
| `@RestControllerAdvice` | Global REST Exception |

Example

```java
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public String error(){

    }

}
```

---

# 9. Scheduling

| Annotation          | Purpose          |
| ------------------- | ---------------- |
| `@EnableScheduling` | Enable scheduler |
| `@Scheduled`        | Run periodically |

Example

```java
@Scheduled(cron = "0 0 * * * *")
public void task(){

}
```

---

# 10. Async

| Annotation     | Purpose           |
| -------------- | ----------------- |
| `@EnableAsync` | Enable async      |
| `@Async`       | Run in background |

---

# 11. Security

| Annotation           | Purpose                       |
| -------------------- | ----------------------------- |
| `@EnableWebSecurity` | Enable Spring Security        |
| `@PreAuthorize`      | Method authorization          |
| `@PostAuthorize`     | Authorization after execution |
| `@Secured`           | Role-based security           |
| `@RolesAllowed`      | JSR role security             |

Example

```java
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin")
public String admin(){

}
```

---

# 12. JDBC / JPA Related

### Spring JDBC

| Annotation       | Purpose     |
| ---------------- | ----------- |
| `@Repository`    | DAO class   |
| `@Transactional` | Transaction |

### Spring Data JPA

| Annotation        | Purpose                                     |
| ----------------- | ------------------------------------------- |
| `@Entity`         | Entity class                                |
| `@Table`          | Database table                              |
| `@Id`             | Primary key                                 |
| `@GeneratedValue` | Auto increment                              |
| `@Column`         | Column mapping                              |
| `@Transient`      | Ignore field                                |
| `@OneToOne`       | One-to-one relationship                     |
| `@OneToMany`      | One-to-many relationship                    |
| `@ManyToOne`      | Many-to-one relationship                    |
| `@ManyToMany`     | Many-to-many relationship                   |
| `@JoinColumn`     | Foreign key                                 |
| `@JoinTable`      | Join table                                  |
| `@Enumerated`     | Enum mapping                                |
| `@Temporal`       | Date/time mapping (legacy `java.util.Date`) |

---

# 13. Testing

| Annotation        | Purpose               |
| ----------------- | --------------------- |
| `@SpringBootTest` | Full application test |
| `@WebMvcTest`     | Controller test       |
| `@DataJpaTest`    | JPA test              |
| `@MockBean`       | Mock Spring Bean      |
| `@Test`           | JUnit test            |
| `@BeforeEach`     | Before each test      |
| `@AfterEach`      | After each test       |

---

# 14. Commonly Used in Your Restaurant Management System

Since your project uses **Spring Boot + Spring JDBC + REST API + JWT**, you'll most frequently use:

```java
@SpringBootApplication
@RestController
@RequestMapping
@GetMapping
@PostMapping
@PutMapping
@DeleteMapping
@Autowired
@Service
@Repository
@Configuration
@Bean
@CrossOrigin
@RequestBody
@PathVariable
@RequestParam
@RequestHeader
@Valid
@Transactional
@ControllerAdvice
@ExceptionHandler
@Component
@Value
```

These annotations cover most of the development needed for a Spring Boot REST application like your Restaurant Management System.
