package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the qualificatif database table.
 * 
 */
@Entity
@NamedQuery(name="Qualificatif.findAll", query="SELECT q FROM Qualificatif q")
public class Qualificatif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_QUALIFICATIF")
	private int idQualificatif;

	private String maximal;

	private String minimal;

	//bi-directional many-to-one association to QuestionEvaluation
	@OneToMany(mappedBy="qualificatif")
	private List<QuestionEvaluation> questionEvaluations;

	public Qualificatif() {
	}

	public int getIdQualificatif() {
		return this.idQualificatif;
	}

	public void setIdQualificatif(int idQualificatif) {
		this.idQualificatif = idQualificatif;
	}

	public String getMaximal() {
		return this.maximal;
	}

	public void setMaximal(String maximal) {
		this.maximal = maximal;
	}

	public String getMinimal() {
		return this.minimal;
	}

	public void setMinimal(String minimal) {
		this.minimal = minimal;
	}

	public List<QuestionEvaluation> getQuestionEvaluations() {
		return this.questionEvaluations;
	}

	public void setQuestionEvaluations(List<QuestionEvaluation> questionEvaluations) {
		this.questionEvaluations = questionEvaluations;
	}

	public QuestionEvaluation addQuestionEvaluation(QuestionEvaluation questionEvaluation) {
		getQuestionEvaluations().add(questionEvaluation);
		questionEvaluation.setQualificatif(this);

		return questionEvaluation;
	}

	public QuestionEvaluation removeQuestionEvaluation(QuestionEvaluation questionEvaluation) {
		getQuestionEvaluations().remove(questionEvaluation);
		questionEvaluation.setQualificatif(null);

		return questionEvaluation;
	}

}