# 2021-1-Term-Project

"find out" 영화 드라마 예능등의 컨텐츠 검색서비스를 만들어 보았음.

첫화면에서 검생창을 바로 띄워서 '작품제목'을 입력하여 검색할 수 있음.
첫화면 하단의 admin을 클릭해서 관리자 로그인 창으로 접속
관리자 로그인(id:a,pwd:a)을 하면 관리자 메뉴에서 정보 입력, 수정, 삭제, 조회 목록이 뜸
각각을 클릭하여 관리자서비스 이용

src

  find.controller
  
    > Controller
    > FrontController
    > HttpUtil
    
    > SearchController
    > LoginController
    > InsertController
    > UpdateController
    > DeleteController
  find.dao
  
    > FindDAO
  find.service
  
    > Service
  find.vo
  
    > ContentVO
    
WebContent
  
  Result
  
    > AdminHome
    > DeleteOutput
    > home
    > InsertOutput
    > searchOutput
    > UpdateOutput
    
  WEB-INF  
  
    > Admin
    > Delete
    > Insert
    > List
    > Login
    > Search
    > Update
  
 
  
    
    
