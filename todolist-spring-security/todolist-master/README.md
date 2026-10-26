# ToDoList com Spring Security

## Como executar

1. Tenha Java 21 e MySQL instalados.
2. Crie o banco `todolist`.
3. Confira o usuário e a senha no arquivo `application.properties`.
4. Execute o projeto:

Windows:
```bash
mvnw.cmd spring-boot:run
```

Linux:
```bash
./mvnw spring-boot:run
```

## Usuários

- **USER:** `user` / `1234`
- **ADMIN:** `admin` / `admin123`

## Como testar

Abra o arquivo `requisicoes.http` no VS Code e clique em **Send Request**.

- USER pode listar, buscar e cadastrar tarefas.
- ADMIN pode fazer tudo, inclusive excluir tarefas.
- Sem login ou com senha errada: `401`.
- USER tentando excluir: `403`.
- ADMIN excluindo: `204`.

Use o ID de uma tarefa existente nos testes de exclusão.

## Respostas

**1. Qual a diferença entre autenticação e autorização?**

Autenticação confirma quem é o usuário. Autorização define o que ele pode fazer.

**2. Para que servem SecurityFilterChain, UserDetailsService e PasswordEncoder?**

- `SecurityFilterChain`: configura a segurança.
- `UserDetailsService`: fornece os usuários.
- `PasswordEncoder`: codifica as senhas.

**3. Qual a diferença entre 401 e 403?**

`401` significa que o login falhou ou não foi informado. `403` significa que o usuário não tem permissão.

**4. Como as permissões foram configuradas?**

USER e ADMIN podem listar, buscar e cadastrar tarefas. Somente ADMIN pode excluir.

**5. O que é CSRF e como foi tratado?**

CSRF é um ataque que tenta fazer o navegador enviar requisições sem a intenção do usuário. A proteção foi desativada para facilitar os testes da API com HTTP Basic. Em aplicações que usam sessões e cookies, ela normalmente deve ser mantida.