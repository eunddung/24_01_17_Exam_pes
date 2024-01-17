import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<WiseSaying> wisesayings = new ArrayList<WiseSaying>();
		Scanner sc = new Scanner(System.in);
		System.out.println("== 명언 앱 실행 ==");
		int lastid = 0;
		int id = lastid + 1;
		while (true) {
			System.out.print("명령어 )");
			String cmd = sc.nextLine();
			if (cmd.equals("등록")) {
				System.out.print("작가: ");
				String writer = sc.nextLine();
				System.out.print("명언: ");
				String wisesaying = sc.nextLine();
				WiseSaying ws = new WiseSaying(id, writer, wisesaying);
				wisesayings.add(ws);
				System.out.printf("%d번 명언이 등록되었습니다\n", id);
				id++;

			} else if (cmd.equals("목록")) {
				if (wisesayings.size() == 0) {
					System.out.println("등록된 명언이 없음");
				} else {
					System.out.println("번호 / 작가 / 명언");
					System.out.println("=".repeat(20));
					for (int i = wisesayings.size() - 1; i >= 0; i--) {
						WiseSaying ws = wisesayings.get(i);
						System.out.printf("%d / %s / %s\n", ws.id, ws.writer, ws.wisesaying);
					}
				}

			} else if (cmd.startsWith("수정")) {
				String[] cmdDiv = cmd.split("\\?id=");
				int i = 0;

				i = Integer.parseInt(cmdDiv[1]);
				for (int n = 0; n < wisesayings.size(); n++) {
					WiseSaying ws = wisesayings.get(n);
					if (ws.id == i) {
						System.out.printf("작가(기존):%s \n", ws.writer);
						System.out.printf("내용(기존):%s \n", ws.wisesaying);
						System.out.println("작가: ");
						String newwriter = sc.nextLine();
						System.out.println("작가: ");
						String newwiessaying = sc.nextLine();

					}

				}

			}
		}

	}

}
