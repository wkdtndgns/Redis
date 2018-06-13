
 # 프로젝트 제목 

  &nbsp;&nbsp; &nbsp;  쿠키 발급을 위한 redis  
  
  <br/>
  
 # 프로젝트 개요
   <p> &nbsp;&nbsp; &nbsp; 레디스는 인메모리DB라 빠른 속도가 강점이지만 큰 용량의 데이터를 담기엔 공간 제약이 크다. <br/>
   &nbsp;&nbsp; &nbsp; 레디스를 프로젝트에 사용하기로 헀고 레디스 예제를 따라 만들고 사용하기 위해 초기 설정을 했습니다.  </p>
   <p> &nbsp;&nbsp; &nbsp; 로그인 세션과 쿠키 Count를 Redis 저장을 구현했습니다. </p>

   
  <br/>
  
 # 사용 기술
 
 <img src="https://user-images.githubusercontent.com/24237454/41213785-6dbd60fe-6d82-11e8-9540-ded5d9fadbbf.PNG" width="300px"  >
 <img src="https://user-images.githubusercontent.com/24237454/41213824-bfd8ad08-6d82-11e8-9f46-f22004592f28.PNG" width="300px" >
 <img src="https://user-images.githubusercontent.com/24237454/41225052-e52e5410-6da8-11e8-87d8-48f3586ac8df.PNG" width="300px" >

  <br/> 
  <br/>
  
 # 프로젝트 설명
 <br/>
 
 <p> 처음에 user의 세션 값이 저장되도록 구현했습니다. </p>
 
 ![1](https://user-images.githubusercontent.com/24237454/41342367-08273696-6f37-11e8-9b22-05d253b45587.PNG)
 
 <br/>

 <p> 다음으로 키에 따라 count dao를 만들어 count값을 증가되도록 구현했습니다. <br/>
 count는 Static 변수로 만들어서 MySQL에 분기점마다 저장이되도록 했습니다. </br> 
 너무 많은 요청으로 서버가 종료되더라도 count의 개수만큼 다시 발급할 수 있 구현했습니다. 
 </p>
 
 
![2](https://user-images.githubusercontent.com/24237454/41342682-c79f98ec-6f37-11e8-8a01-4ac24cc67a30.PNG)

 
 
 <br/>

