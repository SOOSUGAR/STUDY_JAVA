import java.util.TreeMap;

public class TreeMapTest01 {
	public static void main(String[] args) {
		// 사원정보 맵
		// 키 : 사번(String), 값 : 직원이름(String)
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		// 데이터 추가
		map.put("555555", "우영우");
		map.put("333333", "이준호");
		map.put("111111", "최수연");
		map.put("444444", "정명석");
		map.put("222222", "권민우");
		System.out.println(map);
		
		// 중복 키 입력 - 허용X -> 값만 후자의 것으로 덮어씀(수정)
		map.put("444444", "한선영");
		System.out.println(map);
		
		// 중복 값 입력 - 허용
		map.put("666666", "이준호");
		System.out.println(map);
		
	}

}
