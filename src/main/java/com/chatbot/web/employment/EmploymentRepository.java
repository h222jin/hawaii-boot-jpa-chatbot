package com.chatbot.web.employment;
import org.springframework.data.jpa.repository.JpaRepository;
interface EmploymentRepository extends JpaRepository<Member, Long>, IMemberRepository {
}
interface VolunteerRepository extends JpaRepository<Volunteer, Long>, IVolunteerRepository {
}
interface ProgressRepository extends JpaRepository<Progress, Long>, IProgressRepository {
}
interface ArticleRepository extends JpaRepository<Article, Long> {
}