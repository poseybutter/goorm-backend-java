package day3;

public class SeasonChecker {
    public static void main(String[] args) {
        int month = 7;
        String season;
        String activity;

        // switch 문으로 계절 판단 (Fall-through)
        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                activity = "꽃구경 가기 좋은 계절입니다.";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                activity = "바다로 피서 가기 좋은 계절입니다!";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                activity = "단풍 구경 가기 좋은 계절입니다.";
            case 12:
            case 1:
            case 2:
                season = "겨울";
                activity = "스키장 가기 좋은 계절입니다!";
            default:
                season = "알 수 없음";
                activity = "올바른 월(1-12)을 입력해주세요.";
        }

        // 결과 출력
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║         계절 판단 결과                ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 입력한 월: " + month + "월");
        System.out.println("║ 계절: " + season);
        System.out.println("║ 추천: " + activity);
        System.out.println("╚════════════════════════════════════╝");

        // 추가 : 분기별 정보
        int quarter;

        if(month >= 1 && month <= 3) {
            quarter = 1;
        } else if (month >= 4 && month <= 6) {
            quarter = 2;
        } else if (month >= 7 && month <= 9) { // month가 7이었으니 true
            quarter = 3;
        } else if (month >= 10 && month <= 12) {
            quarter = 4;
        } else {
            quarter = 0;
        }

        if (quarter > 0) { // true
            System.out.println("\n" + month + "월은 " + quarter + "분기입니다.");
            // 7월은 3분기입니다.
        }
    }
}
