# Spring Annotations Quick Reference

[Core Spring](#core-spring-annotations) | [Spring Boot](#spring-boot-annotations) | [REST APIs](#rest-controller-annotations) | [Request Parameters](#request-parameter-annotations) | [Validation](#validation-annotations-jakarta-validation) | [Transactions](#transaction-annotation) | [Exceptions](#exception-handling) | [Security](#security) | [JPA / JDBC](#jdbc--jpa-related) | [Testing](#testing)

---

## Core Spring Annotations

| Annotation | Purpose |
| --- | --- |
| `@Component` | Generic Spring bean |
| `@Service` | Service-layer bean |
| `@Repository` | DAO / repository bean |
| `@Controller` | MVC controller |
| `@RestController` | REST controller (`@Controller + @ResponseBody`) |
| `@Configuration` | Marks configuration class |
| `@Bean` | Creates a bean manually |
| `@Autowired` | Dependency injection |
| `@Qualifier` | Select a specific bean |
| `@Primary` | Default bean when multiple exist |
| `@Lazy` | Delays initialization |
| `@Scope` | Controls bean scope |

### Example

```java
@Service
public class UserService {

    @Autowired
    private UserRepository repository;
}
```

---

## Spring Boot Annotations

| Annotation | Purpose |
| --- | --- |
| `@SpringBootApplication` | Main Spring Boot class |
| `@EnableAutoConfiguration` | Enables auto configuration |
| `@ComponentScan` | Scans for components |
| `@ConfigurationProperties` | Binds properties from config |
| `@Value` | Injects a property value |

### Example

```java
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

---

## REST Controller Annotations

| Annotation | Purpose |
| --- | --- |
| `@RequestMapping` | Common route mapping |
| `@GetMapping` | Handles GET requests |
| `@PostMapping` | Handles POST requests |
| `@PutMapping` | Handles PUT requests |
| `@DeleteMapping` | Handles DELETE requests |
| `@PatchMapping` | Handles PATCH requests |
| `@CrossOrigin` | Enables CORS |

### Example

```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAll() {
        return List.of();
    }
}
```

---

## Request Parameter Annotations

| Annotation | Purpose |
| --- | --- |
| `@RequestBody` | Reads JSON from request body |
| `@RequestParam` | Reads URL/form parameter |
| `@PathVariable` | Reads value from URL path |
| `@RequestHeader` | Reads HTTP header |
| `@CookieValue` | Reads cookie value |
| `@RequestAttribute` | Reads request attribute |
| `@ModelAttribute` | Binds form data to object |

### Example

```java
@GetMapping("/{id}")
public User getUser(@PathVariable int id) {
    return null;
}
```

---

## Response Annotations

| Annotation | Purpose |
| --- | --- |
| `@ResponseBody` | Returns JSON/XML directly |
| `@ResponseStatus` | Sets the HTTP status |

### Example

```java
@ResponseStatus(HttpStatus.CREATED)
@PostMapping
public User save() {
    return null;
}
```

---

## Validation Annotations (Jakarta Validation)

| Annotation | Purpose |
| --- | --- |
| `@Valid` | Validates object |
| `@Validated` | Validation at class level |
| `@NotNull` | Must not be null |
| `@NotBlank` | Must not be blank |
| `@NotEmpty` | Must not be empty |
| `@Size` | Checks size |
| `@Min` | Minimum value |
| `@Max` | Maximum value |
| `@Email` | Valid email |
| `@Pattern` | Regex validation |
| `@Past` | Date must be in past |
| `@Future` | Date must be in future |
| `@Positive` | Positive number |
| `@Negative` | Negative number |

### Example

```java
public class User {

    @NotBlank
    private String name;

    @Email
    private String email;
}
```

---

## Transaction Annotation

| Annotation | Purpose |
| --- | --- |
| `@Transactional` | Marks a method or class as transactional |

### Example

```java
@Transactional
public void saveOrder() {
    // database operation
}
```

---

## Exception Handling

| Annotation | Purpose |
| --- | --- |
| `@ExceptionHandler` | Handles a specific exception |
| `@ControllerAdvice` | Global exception handling for MVC |
| `@RestControllerAdvice` | Global exception handling for REST |

### Example

```java
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public String error() {
        return "Error";
    }
}
```

---

## Scheduling

| Annotation | Purpose |
| --- | --- |
| `@EnableScheduling` | Enables scheduling |
| `@Scheduled` | Runs a task periodically |

### Example

```java
@Scheduled(cron = "0 0 * * * *")
public void task() {
    // scheduled job
}
```

---

## Async

| Annotation | Purpose |
| --- | --- |
| `@EnableAsync` | Enables async support |
| `@Async` | Executes method asynchronously |

---

## Security

| Annotation | Purpose |
| --- | --- |
| `@EnableWebSecurity` | Enables Spring Security |
| `@PreAuthorize` | Checks authorization before method execution |
| `@PostAuthorize` | Checks authorization after execution |
| `@Secured` | Role-based security |
| `@RolesAllowed` | JSR-250 role-based security |

### Example

```java
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin")
public String admin() {
    return "Admin";
}
```

---

## JDBC / JPA Related

### Spring JDBC

| Annotation | Purpose |
| --- | --- |
| `@Repository` | Marks DAO/repository class |
| `@Transactional` | Supports transaction management |

### Spring Data JPA

| Annotation | Purpose |
| --- | --- |
| `@Entity` | Marks entity class |
| `@Table` | Maps to table |
| `@Id` | Primary key |
| `@GeneratedValue` | Auto-generated ID |
| `@Column` | Maps column |
| `@Transient` | Ignores field |
| `@OneToOne` | One-to-one relationship |
| `@OneToMany` | One-to-many relationship |
| `@ManyToOne` | Many-to-one relationship |
| `@ManyToMany` | Many-to-many relationship |
| `@JoinColumn` | Foreign key mapping |
| `@JoinTable` | Join table mapping |
| `@Enumerated` | Enum mapping |
| `@Temporal` | Date/time mapping |

---

## Testing

| Annotation | Purpose |
| --- | --- |
| `@SpringBootTest` | Full application context test |
| `@WebMvcTest` | Controller testing |
| `@DataJpaTest` | JPA repository testing |
| `@MockBean` | Mocks Spring bean |
| `@Test` | JUnit test |
| `@BeforeEach` | Runs before each test |
| `@AfterEach` | Runs after each test |

---

## Most Used in a REST Project

These are the most important for a Spring Boot REST API project:

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

These annotations cover most of the work for a Spring Boot REST application.
