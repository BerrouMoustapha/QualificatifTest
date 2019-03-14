package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the reponse_question database table.
 * 
 */
@Embeddable
public class ReponseQuestionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_REPONSE_EVALUATION")
	private int idReponseEvaluation;

	@Column(name="ID_QUESTION_EVALUATION", insertable=false, updatable=false)
	private int idQuestionEvaluation;

	public ReponseQuestionPK() {
	}
	public int getIdReponseEvaluation() {
		return this.idReponseEvaluation;
	}
	public void setIdReponseEvaluation(int idReponseEvaluation) {
		this.idReponseEvaluation = idReponseEvaluation;
	}
	public int getIdQuestionEvaluation() {
		return this.idQuestionEvaluation;
	}
	public void setIdQuestionEvaluation(int idQuestionEvaluation) {
		this.idQuestionEvaluation = idQuestionEvaluation;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReponseQuestionPK)) {
			return false;
		}
		ReponseQuestionPK castOther = (ReponseQuestionPK)other;
		return 
			(this.idReponseEvaluation == castOther.idReponseEvaluation)
			&& (this.idQuestionEvaluation == castOther.idQuestionEvaluation);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idReponseEvaluation;
		hash = hash * prime + this.idQuestionEvaluation;
		
		return hash;
	}
}