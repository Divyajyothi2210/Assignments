import java.util.*;
public class question {
	public int qno;
	public String question;
	List<String> list=new ArrayList<String>();
	Set<String> set=new HashSet<String>();
	Map<Integer,String> map=new HashMap<Integer,String>();
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public void answerList() {
		System.out.println("QuestionId is: "+ getQno());
		System.out.println("Questio is: "+ getQuestion());
		System.out.println("Answer in List is:" +list);
		for(String l:list) {
			System.out.println(l);
		}
	}
	public void answerSet() {
		System.out.println("QuestionId is: "+ getQno());
		System.out.println("Questio is: "+ getQuestion());
		System.out.println("Answer in Set is:" +set);
		
	}
	public void answerMap() {
		System.out.println("QuestionId is: "+ getQno());
		System.out.println("Questio is: "+ getQuestion());
		System.out.println("Answer in Map is:" +map);


	}
	
}
