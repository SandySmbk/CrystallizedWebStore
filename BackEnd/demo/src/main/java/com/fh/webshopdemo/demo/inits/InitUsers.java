/*package com.fh.webshopdemo.demo.inits;

private void InitUsers() {
    

    Privilege privilege1 = privilegeRepository.findByName("FOO_READ_PRIVILEGE");
    Privilege privilege2 = privilegeRepository.findByName("FOO_WRITE_PRIVILEGE");
    
    User user1 = new User();
    user1.setUsername("john");
    user1.setPassword("123");
    user1.setPrivileges(new HashSet<Privilege>(Arrays.asList(privilege1)));
    user1.setOrganization(organizationRepository.findByName("FirstOrg"));
    userRepository.save(user1);
    
    User user2 = new User();
    user2.setUsername("tom");
    user2.setPassword("111");
    user2.setPrivileges(new HashSet<Privilege>(Arrays.asList(privilege1, privilege2)));
    user2.setOrganization(organizationRepository.findByName("SecondOrg"));
    userRepository.save(user2);
}
*/