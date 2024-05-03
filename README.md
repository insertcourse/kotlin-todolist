# Kotlin Todolist
---
코틀린 + 스프링 공부를 위한 레포지토리입니다.

## 기능 명세

1. Todo에는 Id, Title, Description, Created_At, Finshed_At, Target_Date가 존재해야합니다
2. Todo를 모두 조회하는 api를 개발해야하며 완료되지 않은 TOdo ,Target_Date 가 가까운 순서대로 정렬해야합니다
3. Todo를 생성하는 api가 있어야합니다
4. Todo를 업데이트 할 수 있어야 하며 Created_At은 수정되어서는 안됩니다
5. Todo의 완료 상태만을 수정하는 api가 있어야합니다

## 추가 제약사항

1. 코틀린 학습을 위해 Jpa에서 사용가능한 OrderBy를 사용하지 않습니다
