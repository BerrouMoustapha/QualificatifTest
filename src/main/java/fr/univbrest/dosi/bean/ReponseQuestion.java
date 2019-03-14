package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reponse_question database table.
 * 
 */
@Entity
@Table(name="reponse_question")
@NamedQuery(name="ReponseQuestion.findAll", query="SELECT r FROM ReponseQuestion r")
public class ReponseQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReponseQuestionPK id;

	private int positionnement;

	//bi-directional many-to-one association to QuestionEvaluation
	@ManyToOne()
	@JoinColumn(name="ID_QUESTION_EVALUATION", insertable=false, updatable=false)
	private QuestionEvaluation questionEvaluation;

	public ReponseQuestion() {
	}

	public ReponseQuestionPK getId() {
		return this.id;
	}

	public void setId(ReponseQuestionPK id) {
		this.id = id;
	}

	public int getPositionnement() {
		return this.positionnement;
	}

	public void setPositionnement(int positionnement) {
		this.positionnement = positionnement;
	}

	public QuestionEvaluation getQuestionEvaluation() {
		return this.questionEvaluation;
	}

	public void setQuestionEvaluation(QuestionEvaluation questionEvaluation) {
		this.questionEvaluation = questionEvaluation;
	}

}