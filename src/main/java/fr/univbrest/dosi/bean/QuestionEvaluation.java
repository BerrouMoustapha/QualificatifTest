package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the question_evaluation database table.
 * 
 */
@Entity
@Table(name="question_evaluation")
@NamedQuery(name="QuestionEvaluation.findAll", query="SELECT q FROM QuestionEvaluation q")
public class QuestionEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_QUESTION_EVALUATION")
	private int idQuestionEvaluation;

	@Column(name="ID_QUESTION")
	private int idQuestion;

	@Column(name="ID_RUBRIQUE_EVALUATION")
	private int idRubriqueEvaluation;

	private String intitule;

	private int ordre;

	//bi-directional many-to-one association to Qualificatif
	@ManyToOne
	@JoinColumn(name="ID_QUALIFICATIF")
	private Qualificatif qualificatif;

	//bi-directional many-to-one association to ReponseQuestion
	@OneToMany(mappedBy="questionEvaluation")
	private List<ReponseQuestion> reponseQuestions;

	public QuestionEvaluation() {
	}

	public int getIdQuestionEvaluation() {
		return this.idQuestionEvaluation;
	}

	public void setIdQuestionEvaluation(int idQuestionEvaluation) {
		this.idQuestionEvaluation = idQuestionEvaluation;
	}

	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public int getIdRubriqueEvaluation() {
		return this.idRubriqueEvaluation;
	}

	public void setIdRubriqueEvaluation(int idRubriqueEvaluation) {
		this.idRubriqueEvaluation = idRubriqueEvaluation;
	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public Qualificatif getQualificatif() {
		return this.qualificatif;
	}

	public void setQualificatif(Qualificatif qualificatif) {
		this.qualificatif = qualificatif;
	}

	public List<ReponseQuestion> getReponseQuestions() {
		return this.reponseQuestions;
	}

	public void setReponseQuestions(List<ReponseQuestion> reponseQuestions) {
		this.reponseQuestions = reponseQuestions;
	}

	public ReponseQuestion addReponseQuestion(ReponseQuestion reponseQuestion) {
		getReponseQuestions().add(reponseQuestion);
		reponseQuestion.setQuestionEvaluation(this);

		return reponseQuestion;
	}

	public ReponseQuestion removeReponseQuestion(ReponseQuestion reponseQuestion) {
		getReponseQuestions().remove(reponseQuestion);
		reponseQuestion.setQuestionEvaluation(null);

		return reponseQuestion;
	}

}