import models.enums.Level
import models.EducationalContent
import models.Training
import models.User

fun main() {

    // Criando usuários
    val userLeonardo = User("Leonardo", "leodoima@hotmail.com")
    val userLucas = User("Lucas", "lucas@hotmail.com")

    // Criando matérias
    val logica = EducationalContent("Lógica de programação", 120)
    val algoritmos = EducationalContent("Algoritmos", 120)
    val introOO = EducationalContent("Orientação a objetos - introdução", 120)
    val boasPraticasOO = EducationalContent("Orientação a objetos - boas práticas", 70)
    val estruturaDados = EducationalContent("Estrutura de dados", 80)
    val desingPatters = EducationalContent("Aplicando design patterns", 160)
    val docker = EducationalContent("Estrutura de dados", 60)

    // Definido conteúdos das classes
    val contentsBasic = mutableSetOf<EducationalContent>(algoritmos, logica, introOO)
    val contentsIntermediary = mutableSetOf<EducationalContent>(boasPraticasOO, estruturaDados)
    val contentsAdvanced = mutableSetOf<EducationalContent>(desingPatters, docker)

    // Criando cursos/treinamentos
    val javaBasic = Training("Java Basico", contentsBasic, Level.BASIC)
    val javaIntermediary = Training("Java Intermediário", contentsIntermediary, Level.INTERMEDIARY)
    val javaAdvanced = Training("Java Avançado", contentsAdvanced, Level.ADVANCED)

    // Matriculando alunos
    javaBasic.enroll(userLeonardo)
    javaBasic.enroll(userLeonardo) // Deverá gerar exceção por já estar matriculado
    javaIntermediary.enroll(userLeonardo)
    javaAdvanced.enroll(userLeonardo)

    javaBasic.enroll(userLucas)
}
