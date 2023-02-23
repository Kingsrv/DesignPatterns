package creational.prototypeAndRegistry;

public class Client {
    public static StudentRegistry fillUpRegister(StudentRegistry studentRegistry){
        Student aprBatch = new Student();
        aprBatch.setBatchName("Apr-LLD");
        aprBatch.setAvgBatchPsp(80);
        aprBatch.setYearOfEnrollment(2021);
        studentRegistry.register(aprBatch);

        Student mayBatch = new Student();
        mayBatch.setBatchName("May-LLD");
        mayBatch.setAvgBatchPsp(85);
        mayBatch.setYearOfEnrollment(2022);
        studentRegistry.register(mayBatch);

        IntelligentStudent intelligentStudentAprBatch = new IntelligentStudent();
        intelligentStudentAprBatch.setBatchName("Intelligent-Apr-LLD");
        intelligentStudentAprBatch.setAvgBatchPsp(80);
        intelligentStudentAprBatch.setYearOfEnrollment(2021);
        intelligentStudentAprBatch.setIq(100);
        studentRegistry.register(intelligentStudentAprBatch);

        return studentRegistry;

    }

    public static void main(String[] args) {
//        Student template = new Student();
//        template.setAvgBatchPsp(80);
//        template.setBatchName("Nov-LLD");
//        template.setYearOfEnrollment(2022);
//
//        Student copyStudent = template.clone();
//        System.out.println(copyStudent.getAvgBatchPsp());
//        System.out.println(copyStudent.getBatchName());
//        System.out.println(copyStudent.getYearOfEnrollment());

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry = fillUpRegister(studentRegistry);
        Student aprBatchTemplateObj = studentRegistry.get("Apr-LLD").clone();
        Student mayBatchTemplateObj = studentRegistry.get("May-LLD").clone();

       //use the above object as a template and write the data which is not constant.
    }
}
