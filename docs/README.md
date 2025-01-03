# **🤔 체크 리스트**

- 이벤트 위한 예산은 **충분히 확보**됨 -> 무한

**목표**

- **중복**된 할인 및 증정 가능
- 지난 5년 중 최고 판매 금액 달성 목표
- 12월 참여 고객 5%가 1월 새해 이벤트 재참여 유도 목표

**12월 이벤트**

- 크리스마스 디데이 할인
    - 기간 12.1 ~ 12.25
    - 1000원 시작 크리스마스 다가올수록 날마다 할인 금액 100원 증가
    - 총주문 금액에서 해당 금액만큼 할인
    - (e.g. 시작일인 12월 1일에 1,000원, 2일에 1,100원, ..., 25일엔 3,400원 할인)
- 평일 할인 (일~목)
    - 디저트 메뉴 개당 2023원 할인
- 주말 할인 (금,토)
    - 메인 메뉴 개당 2023원 할인
- 특별 할인
    - 별있는 날 총 주문 금액 1000원 할인
- 증정 이벤트
    - 할인 전 총 주문 금액 12만원 이상일 경우 샴페인 1개 증정
- 디데이 할인 제외 다른 이벤트는 12월 전체 기간에 적용

**12월 이벤트 배지**

- 총 혜택 금액에 따라 이벤트 배지 부여
    - 새해 이벤트에서 활용 예정
    - 베지에 따라 새해 선물 증정
    - 5천 원 이상: 별
    - 1만 원 이상: 트리
    - 2만 원 이상: 산타

**이벤트 주의사항**

- 총주문 금액 10,000원 이상부터 이벤트가 적용됩니다.
- 음료만 주문 시, 주문할 수 없습니다.
- 메뉴는 한 번에 최대 20개까지만 주문할 수 있습니다.
  (e.g. 시저샐러드-1, 티본스테이크-1, 크리스마스파스타-1, 제로콜라-3, 아이스크림-1의 총개수는 7개)

**메뉴**

<애피타이저>
양송이수프(6,000), 타파스(5,500), 시저샐러드(8,000)

<메인>
티본스테이크(55,000), 바비큐립(54,000), 해산물파스타(35,000), 크리스마스파스타(25,000)

<디저트>
초코케이크(15,000), 아이스크림(5,000)

<음료>
제로콜라(3,000), 레드와인(60,000), 샴페인(25,000)

# **✅ 기능 목록 정리**

12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)
주문하실 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)

- [x]  입력 처리 기능
    - [x]  고객에게 방문 날짜와 메뉴를 입력 받는다.

- [x]  방문 날짜 유효성 검사 기능
- [ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.
    - [x]  입력된 날짜가 범위를 벗어날 경우 예외를 발생시킵니다.
    - [x]  입력된 날짜 숫자가 아닌 경우 예외를 발생시킵니다.

- [x] 주문 입력값 처리 기능
    - [x] 입력 메뉴 유효성 검사 기능
    - [ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.
        - [x]  입력 메뉴가 메뉴판에 없을 경우 예외를 발생시킵니다.
        - [x]  입력된 메뉴 개수의 유효성 검사를 실시합니다.
            - [x]  1 미만의 숫자 입력 시 예외를 발생시킵니다.
        - [x]  메뉴 형식이 예시와 다른 경우 예외를 발생시킵니다.
        - [x]  중복 메뉴 입력될 경우 예외를 발생시킵니다.
        - [x]  주문량이 20을 초과할 경우 예외를 발생시킵니다.
    - [x] 입력 메뉴 리스트 정리 기능
        - [x] 메뉴 입력 형식에 따라 입력 메뉴 리스트를 정리합니다.
        - [x] 입력 받은 메뉴들의 종류와 개수를 정리합니다.

- [x]  이벤트 적용 가능 여부 확인 기능
    - [x]  총 주문 금액 10000원 이상부터 이벤트 적용
    - [x]  음료만 주문 시 적용 불가
    - [x]  메뉴는 한번에 최대 20개 까지만 가능
    - (e.g. 시저샐러드-1, 티본스테이크-1, 크리스마스파스타-1, 제로콜라-3, 아이스크림-1의 총개수는 7개)
- [x]  주문 금액 계산 기능
    - [x]  디데이 할인 기능
        - 기간 12.1 ~ 12.25
        - [x]  1000원에서 디데이 다가올 수록 100원씩 증가하여 할인
        - 총 금액에서 할인
    - [x]  평일, 주말 할인 기능
        - [x]  평일 - 디저트 메뉴 개당 2023원 할인
        - [x]  주말 - 메인 메뉴 개당 2023원 할인
    - [x]  특별 할인 기능
        - [x]  별이 있는 날일 경우 총 금액 1000원 할인
    - [x]  증정 이벤트 기능
        - [x]  총 금액 12만원 이상일 경우 샴페인 1개 증정
        - [ ]  증정 이벤트가 적용되고 주문 목록에 샴페인이 있을 경우, 주문 수량을 하나 줄이고 증정 샴페인으로 교체한다.
    - [x]  총 금액 계산 기능
        - [x]  총 금액을 계산합니다.
- [x]  이벤트 배지 부여 기능
    - [x]  혜택 금액에 따라 이벤트 배지 부여
    - 5천 원 이상: 별
    - 1만 원 이상: 트리
    - 2만 원 이상: 산타

- [x]  출력 처리 기능
    - [x]  메뉴 출력 기능
    - [x]  총 혜택 금액에 따른 이벤트 배지 이름을 출력 기능
    - [x]  총 혜택 금액을 출력 기능
        - 할인 금액의 합계 + 증정 메뉴의 가격
    - [x]  할인 후 예상 결제 금액을 출력 기능
        - 할인 전 총 주문 금액 - 할인 금액
    - [x]  증정 메뉴를 출력 기능
        - [x]  증정 이벤트에 해당하지 않는 경우, 증정 메뉴 `”없음”` 출력
    - [x]  혜택 내역 출력 기능
        - [x]  적용된 이벤트 내역 출력
        - [x]  적용된 이벤트가 하나도 없을 경우 `"없음"` 출력
        - [x]  여러 개 이벤트가 적용된 경우, 출력 순서는 자유롭게 출력
    - [x]  이벤트 배지
        - 이벤트 배지가 부여되지 않는 경우, `"없음"` 출력
- [x] 재입력 기능
    - 잘못된 입력을 받았을 경우, 입력을 그 부분부터 다시 받는다.

# 🎯 결과 예시

**적용 이벤트 없는 경우 예시**

```
안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.
12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)
26
주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)
타파스-1,제로콜라-1
12월 26일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!

<주문 메뉴>
타파스 1개
제로콜라 1개

<할인 전 총주문 금액>
8,500원

<증정 메뉴>
없음

<혜택 내역>
없음

<총혜택 금액>
0원

<할인 후 예상 결제 금액>
8,500원

<12월 이벤트 배지>
없음

```

**기대 이벤트 플래너 예시**

```
안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.
12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)
3
주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)
티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-1
12월 3일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!

<주문 메뉴>
티본스테이크 1개
바비큐립 1개
초코케이크 2개
제로콜라 1개

<할인 전 총주문 금액>
142,000원

<증정 메뉴>
샴페인 1개

<혜택 내역>
크리스마스 디데이 할인: -1,200원
평일 할인: -4,046원
특별 할인: -1,000원
증정 이벤트: -25,000원

<총혜택 금액>
-31,246원

<할인 후 예상 결제 금액>
135,754원

<12월 이벤트 배지>
산타

```