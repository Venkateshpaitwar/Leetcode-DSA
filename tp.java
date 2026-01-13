//-------------------- practice delete method ------------------
// class solution{
//     public void delete(Long id) {
//         JournalEntry entry = journalRepository.findById(id);
//         if(entry == null){
//             return new RuntimeException("no record found to delete");
//         }
//         journalRepository.delete(entry);
//     }
// }

// ---> Spring version java ---

// public void delete(long id){
//     JournalEntry entry = journalRepository.findById(id);
//     .orElseThrow(() ->new RunTimeExcepyion("no record found to be deleted"));
//     journalRepository.delete(entry);

// }
